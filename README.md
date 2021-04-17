## 本地环境准备
docker-compose up -d
ps：
- 进入容器 例如：docker exec -it demo-mysql bash 
 
## 结构
- admin 提供给管理面的 API
    - rest
    - service
    - usecase
- forntend 提供给用户面使用的 API
- domain 领域
    - user 
        - modal
        - repository
        - service
    - auth
    - article
- bootstrap 项目启动

## 待实现
- Authority
- user 的role区分（普通用户与管理员）
- user 对 article 的管理
- admin 对 article 的管理
- article 与 tag （多对多）
- exception体系
- 测试规范（api测试，单元测试）
- 外部系统对接（如微信/支付宝）

ps：
belongs to：实体在同一生命周期内，被拥有的实体随拥有实体的生命周期结束而结束。
many to many：实体在各自的生命周期，任一生命周期结束，解除关系。实体保持干净，关系证明作为实体。
