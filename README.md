# 项目名称

本项目是一个基于微服务架构的后端系统，使用 Java 进行开发。项目分为多个模块，每个模块负责不同的业务功能。本文档将介绍每个模块的作用以及开发注意事项。

## 模块说明

### 1. Common-Server
- **作用**: 提供全局通用的功能和服务，包括工具类、日志管理、异常处理、公共配置等。该模块也是API网关的入口，处理认证、路由和负载均衡。

### 2. Flowable-Server
- **作用**: 专门用于业务流程管理，集成了Flowable引擎。该模块负责所有业务流程的定义、执行和监控，包括客户审批流程和订单审批流程。

### 3. Customer-Server
- **作用**: 处理与客户管理相关的业务逻辑。包括客户的创建、修改、删除和查询功能，以及调用Flowable-Server中的流程服务来处理客户审批。

### 4. Order-Server
- **作用**: 管理订单的整个生命周期，包含订单的创建、更新、查询功能。还会调用Flowable-Server中的流程服务来管理订单审批流程。

### 5. Product-Server
- **作用**: 负责产品信息和库存的管理。提供产品的增删改查功能，以及库存管理的功能，如库存的增加、减少和查询。

### 6. Billing-Server
- **作用**: 处理与订单相关的财务事务，包括开票和收款功能。管理发票的创建、支付和对账。

### 7. Shipping-Server
- **作用**: 负责发货和物流管理。处理订单的发货信息，管理物流状态跟踪，并提供运输方式管理功能。

## 开发注意事项

### 配置文件
在项目的 `.gitignore` 文件中，已经设置了忽略所有以 `.yml` 和 `.properties` 结尾的文件。这意味着 Git 不会追踪这些文件。因此，请确保在本地环境中自行设置这些配置文件，以保证项目能够正常运行。

示例：
```plaintext
*.yml
*.properties
**/*.yml
**/*.properties
