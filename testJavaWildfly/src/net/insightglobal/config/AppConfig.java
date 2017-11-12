package net.insightglobal.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "net.insightglobal.model")
@ComponentScan(basePackages = "net.insightglobal.controller")
@EnableJpaRepositories(basePackages = "net.insightglobal.repositories")
@EnableTransactionManagement
public class AppConfig {

	@Resource
	private Environment env;

	@Bean
	public DataSource getDataSource() {
		// DriverManagerDataSource dataSource = new DriverManagerDataSource();
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("com.mysql.jdbc.Driver"));//db.driver
		dataSource.setUrl(env.getProperty("jdbc:mysql://localhost:3306/testinsight"));//db.url
		dataSource.setUsername(env.getProperty("root"));//db.user
		dataSource.setPassword(env.getProperty("admin"));//db.password
		return dataSource;
	}
	
	

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setDataSource(getDataSource());
		entityManagerFactoryBean.setPackagesToScan("net.insightglobal.repositories");
		entityManagerFactoryBean.setJpaVendorAdapter(getJpaVendorAdapter());
		
		Properties props = new Properties();
		props.setProperty("hibernate.format_sql", String.valueOf(true));
		entityManagerFactoryBean.setJpaProperties(props);

		return entityManagerFactoryBean;
	}

	@Bean
	public JpaVendorAdapter getJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		/*adapter.setDatabase(Database.H2);*/
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		return adapter;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}

	@Bean
	public BeanPostProcessor persistenceTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

}
