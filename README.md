# MySpringMVC

Demo for using Spring integrate MyBatis in your project


* MyBatis Configuration in Spring XML

*applicationContext.xml*


	<!-- *Configurate DataSource Using Druid* -->
	<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
		<property name="url"
			value="jdbc:postgresql://localhost:5432/mydb" />
		<property name="username" value="xxx" />
		<property name="password" value="" />
	</bean>
	
	<!-- *Configurate SqlSessionFactory (Core) * -->
	<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource"></property>
		<property name="typeAliasesPackage" value="com.wolaidai.db.model" />
	</bean>
	
	<!-- *Configurate mappers scanned locations* -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.wolaidai.db.mapper" />
		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
	</bean>
	
	<!-- *Use Spring Transaction Manager (must the same dataSource)* -->
	<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<property name="dataSource" ref="dataSource"></property>
	</bean>
	
	<!-- *Makes you can use such @Transactional annotations* -->
	<tx:annotation-driven transaction-manager="transactionManager" />
		