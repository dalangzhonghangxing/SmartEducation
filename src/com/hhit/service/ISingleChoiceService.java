package com.hhit.service;

import com.hhit.base.IDaoSupport;
import com.hhit.entity.SingleChoice;

public interface ISingleChoiceService extends IDaoSupport<SingleChoice>{

	//最后一条记录
	public SingleChoice findMaxRecord();
	//第一条记录
	public SingleChoice findMinRecord();
}
