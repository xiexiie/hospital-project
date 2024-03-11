package com.lb.entity;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;


@Data
@Table(name="lb_news")
public class LbNews   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_title = "title";
	public static final String ALIAS_create_time = "create_time";
	
	private Integer id ;
	private String content ;
	private String title ;
	private Date createTime ;

}
