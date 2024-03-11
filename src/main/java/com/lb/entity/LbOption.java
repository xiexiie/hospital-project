package com.lb.entity;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;


@Data
@Table(name="lb_option")
public class LbOption   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_name = "name";
	public static final String ALIAS_price = "price";
	public static final String ALIAS_type = "type";
	
	private Integer id ;
	private String name ;
	private BigDecimal price ;
	private String type ;
}
