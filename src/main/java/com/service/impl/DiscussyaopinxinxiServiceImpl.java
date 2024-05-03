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


import com.dao.DiscussyaopinxinxiDao;
import com.entity.DiscussyaopinxinxiEntity;
import com.service.DiscussyaopinxinxiService;
import com.entity.vo.DiscussyaopinxinxiVO;
import com.entity.view.DiscussyaopinxinxiView;

@Service("discussyaopinxinxiService")
public class DiscussyaopinxinxiServiceImpl extends ServiceImpl<DiscussyaopinxinxiDao, DiscussyaopinxinxiEntity> implements DiscussyaopinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyaopinxinxiEntity> page = this.selectPage(
                new Query<DiscussyaopinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyaopinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyaopinxinxiEntity> wrapper) {
		  Page<DiscussyaopinxinxiView> page =new Query<DiscussyaopinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyaopinxinxiVO> selectListVO(Wrapper<DiscussyaopinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyaopinxinxiVO selectVO(Wrapper<DiscussyaopinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyaopinxinxiView> selectListView(Wrapper<DiscussyaopinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyaopinxinxiView selectView(Wrapper<DiscussyaopinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
