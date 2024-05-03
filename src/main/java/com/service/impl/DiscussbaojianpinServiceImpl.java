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


import com.dao.DiscussbaojianpinDao;
import com.entity.DiscussbaojianpinEntity;
import com.service.DiscussbaojianpinService;
import com.entity.vo.DiscussbaojianpinVO;
import com.entity.view.DiscussbaojianpinView;

@Service("discussbaojianpinService")
public class DiscussbaojianpinServiceImpl extends ServiceImpl<DiscussbaojianpinDao, DiscussbaojianpinEntity> implements DiscussbaojianpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaojianpinEntity> page = this.selectPage(
                new Query<DiscussbaojianpinEntity>(params).getPage(),
                new EntityWrapper<DiscussbaojianpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaojianpinEntity> wrapper) {
		  Page<DiscussbaojianpinView> page =new Query<DiscussbaojianpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaojianpinVO> selectListVO(Wrapper<DiscussbaojianpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaojianpinVO selectVO(Wrapper<DiscussbaojianpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaojianpinView> selectListView(Wrapper<DiscussbaojianpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaojianpinView selectView(Wrapper<DiscussbaojianpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
