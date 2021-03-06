package com.hhit.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hhit.base.DaoSupportImpl;
import com.hhit.entity.DataDict;
import com.hhit.service.IDataDictService;

@Service
@Transactional
public class DataDictServiceImpl extends DaoSupportImpl<DataDict> implements IDataDictService{

	@Override
	public DataDict findByDictNum(String dictNum) {
		return (DataDict) getSession().createQuery("FROM DataDict WHERE dictNum=?")//
				.setParameter(0, dictNum)//
				.uniqueResult();
	}

}
