package com.mingi.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserMessage is a Querydsl query type for UserMessage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserMessage extends EntityPathBase<UserMessage> {

    private static final long serialVersionUID = 1569056088L;

    public static final QUserMessage userMessage = new QUserMessage("userMessage");

    public final StringPath acceptLanguage = createString("acceptLanguage");

    public final DateTimePath<java.util.Date> dateCreated = createDateTime("dateCreated", java.util.Date.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipAddr = createString("ipAddr");

    public final StringPath ipAddress = createString("ipAddress");

    public final StringPath name = createString("name");

    public final StringPath referer = createString("referer");

    public final StringPath text = createString("text");

    public final StringPath userAgent = createString("userAgent");

    public QUserMessage(String variable) {
        super(UserMessage.class, forVariable(variable));
    }

    public QUserMessage(Path<UserMessage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserMessage(PathMetadata metadata) {
        super(UserMessage.class, metadata);
    }

}

