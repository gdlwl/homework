1、用一句自己的话总结学过的设计模式
设计模式	总结
工厂模式（Factory）	工厂负责创建管理，客户使用工厂
单例模式（Singleton）	一个实例可供多个客户使用，节省资源
原型模式（Prototype）	New太麻烦了，还是复制方便
代理模式（Proxy）	找我的代理人办事吧，别直接找我
委派模式（Delegate）	任务收到我一定做好,偷偷把任务交给别人
模板模式（Template）	我定制标准流程，你们自己看着办
适配器模式（Adapter）	旧的不适用需要转换
装饰器模式（Decorator）	打扮漂亮一点，我还是我

2、列举SpringAOP、IOC、DI应用的代码片段。
SpringAOP 给service增加事务
	<!--  拦截器方式配置事务 -->
	<tx:advice id="mysqlTransactionAdvice" transaction-manager="mysqlTransactionManager">
		<tx:attributes>
			<tx:method name="save*" propagation="REQUIRED" />
			<tx:method name="insert*" propagation="REQUIRED" />
			<tx:method name="delete*" propagation="REQUIRED" />
            <tx:method name="update*" propagation="REQUIRED" />
			<tx:method name="find*" propagation="SUPPORTS" />
			<tx:method name="*" propagation="SUPPORTS" />
		</tx:attributes>
	</tx:advice>
	<aop:config proxy-target-class="true">
		<aop:pointcut id="mysqlTransactionPointcut" expression="execution(* com.service.*.*(..))" />
		<aop:advisor pointcut-ref="mysqlTransactionPointcut" advice-ref="mysqlTransactionAdvice" />
	</aop:config>
  
IOC控制反转是指new实例工作不由我们程序员来做而是交给spring容器来做，如LoginLogDao交给SPRING创建管理
@Service("LoginLogService")
public class LoginLogServiceImp implements LoginLogService{
	@Autowired
	private LoginLogDao dao;	

}
DI依赖注入,SPRING，不但负责创建对象，还会负责维护对象之间的依赖引用关系
如下SPRING会自动查找name为mysqlDataSource的数据源实例赋值给实例mysqlSqlSessionFactory的dataSource属性
<!-- MyBatis配置 -->
<bean id="mysqlSqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <!-- 指定数据源 -->
    <property name="dataSource" ref="mysqlDataSource" />
</bean>  
