- #### maven插件命令：mybatis-generator:generate -e

  - 可以根据数据库生成model、mapper.xml、mapper接口和Example，通常情况下的单表查询不用再手写mapper；
  - 导入插件mybatis-generator-maven-plugin；

- #### SpringSecurity+JWT 登录认证和授权

  - utils包下的JwtTokenUtil.java工具类生成Token及解析token；
  - config包下的SecurityConfig为SpringSecurity的配置，配置鉴权认证；
  - component包下定义了登录拦截器组件，和Token无访问权限或失效自定义返回的结果组件；
  - Controller方法上加入@PreAuthorize**("hasAuthority('具体权限')")即可

- #### elasticsearch实现商品搜索功能

  - document包下的EsProduct类为搜索的文档对象信息
  - repository包下的EsProductRepository为操作Elasticsearch数据库的接口方法

- #### RabbitMQ实现延迟消息

  - RabbitMqConfig为rabbit MQ的配置
    - 使用direct交换器
    - 增加延迟队列（死信队列，消息过期存入该队列）
  - CancelOrderSender模拟消息发送者，CancelOrderReceiver模拟消息接收者
  - mq.rabbitmq包下实现有rabbitmq的发布订阅功能，消息集群功能代码，对应的测试类在test包下

- #### Redis实现缓存功能

  - cache/redis包下使用LettuceConnectionFactory客户端(对应测试类在test包下对应目录)
    - a1_replaction实现redis主从复制读写分离功能
    - a2_pipeline 实现redis的管道pipeline功能
    - a3_pubsub通过subscribe实现redis发布订阅功能
    - a4_sentinel实现哨兵高可用机制
  - JedisConnectionFactory 使用jedis客户端实现（对应测试类在test包下对应目录）
    - a5_cluster实现redis集群功能
  - Lettuce 和 Jedis 都是Redis的client，所以他们都可以连接 Redis Server。
    Jedis在实现上是直接连接的Redis Server，如果在多线程环境下是非线程安全的。
    每个线程都去拿自己的 Jedis 实例，当连接数量增多时，资源消耗阶梯式增大，连接成本就较高了。
    Lettuce的连接是基于Netty的，Netty 是一个多线程、事件驱动的 I/O 框架。连接实例可以在多个线程间共享，当多线程使用同一连接实例时，是线程安全的。
    所以，一个多线程的应用可以使用同一个连接实例，而不用担心并发线程的数量。
    当然这个也是可伸缩的设计，一个连接实例不够的情况也可以按需增加连接实例。

