package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaojianpinDao;
import com.entity.BaojianpinEntity;
import com.service.BaojianpinService;
import com.entity.vo.BaojianpinVO;
import com.entity.view.BaojianpinView;

@Service("baojianpinService")
public class BaojianpinServiceImpl extends ServiceImpl<BaojianpinDao, BaojianpinEntity> implements BaojianpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaojianpinEntity> page = this.selectPage(
                new Query<BaojianpinEntity>(params).getPage(),
                new EntityWrapper<BaojianpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaojianpinEntity> wrapper) {
		  Page<BaojianpinView> page =new Query<BaojianpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaojianpinVO> selectListVO(Wrapper<BaojianpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaojianpinVO selectVO(Wrapper<BaojianpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaojianpinView> selectListView(Wrapper<BaojianpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaojianpinView selectView(Wrapper<BaojianpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
