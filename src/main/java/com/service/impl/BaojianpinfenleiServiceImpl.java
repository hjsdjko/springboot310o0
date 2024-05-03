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


import com.dao.BaojianpinfenleiDao;
import com.entity.BaojianpinfenleiEntity;
import com.service.BaojianpinfenleiService;
import com.entity.vo.BaojianpinfenleiVO;
import com.entity.view.BaojianpinfenleiView;

@Service("baojianpinfenleiService")
public class BaojianpinfenleiServiceImpl extends ServiceImpl<BaojianpinfenleiDao, BaojianpinfenleiEntity> implements BaojianpinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaojianpinfenleiEntity> page = this.selectPage(
                new Query<BaojianpinfenleiEntity>(params).getPage(),
                new EntityWrapper<BaojianpinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaojianpinfenleiEntity> wrapper) {
		  Page<BaojianpinfenleiView> page =new Query<BaojianpinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaojianpinfenleiVO> selectListVO(Wrapper<BaojianpinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaojianpinfenleiVO selectVO(Wrapper<BaojianpinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaojianpinfenleiView> selectListView(Wrapper<BaojianpinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaojianpinfenleiView selectView(Wrapper<BaojianpinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
