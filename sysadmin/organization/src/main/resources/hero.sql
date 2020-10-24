create table hero
(
    id           varchar(20)  not null comment '编号'
        primary key,
    name         varchar(200) not null comment '名称',
    fee          int comment '费用',
    profession   varchar(200) comment '职业',
    description  varchar(500) comment '描述',
    deleted      varchar(1) default 'N' comment '是否已删除Y：已删除，N：未删除',
    created_time datetime   default CURRENT_TIMESTAMP comment '创建时间',
    updated_time datetime   default CURRENT_TIMESTAMP comment '更新时间',
    created_by   varchar(100) comment '创建人',
    updated_by   varchar(100) comment '更新人'
)
    comment '人物表';

create table feature
(
    id              varchar(20)  not null comment '编号'
        primary key,
    feature_name    varchar(200) not null comment '名称',
    combination     int          not null comment '组合数量',
    combination_fee int comment '组合费用',
    description     varchar(500) comment '描述',
    deleted         varchar(1) default 'N' comment '是否已删除Y：已删除，N：未删除',
    created_time    datetime   default CURRENT_TIMESTAMP comment '创建时间',
    updated_time    datetime   default CURRENT_TIMESTAMP comment '更新时间',
    created_by      varchar(100) comment '创建人',
    updated_by      varchar(100) comment '更新人'
)
    comment '特征表';

create table hero_feature
(
    hero_id    varchar(20) not null comment '人物编号',
    feature_id varchar(20) not null comment '特征编号'
)
    comment '人物特征关联表';

create table combination_manage
(
    feature_id      varchar(20) not null comment '特征编号',
    combination     int         not null comment '组合数量',
    combination_fee int         not null comment '组合费用'
)
    comment '组合管理';