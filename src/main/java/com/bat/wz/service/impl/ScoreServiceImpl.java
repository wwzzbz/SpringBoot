package com.bat.wz.service.impl;

import com.bat.wz.mbg.entity.Score;
import com.bat.wz.mbg.entity.ScoreExample;
import com.bat.wz.mbg.entity.User;
import com.bat.wz.mbg.mapper.ScoreMapper;
import com.bat.wz.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ScoreServiceImpl
 * @Description 积分业务实现类
 * @Date 2020/4/24 14:39
 * @Created by wz
 */
@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public int insertScore(Score score) {
        return scoreMapper.insert(score);
    }

    @Override
    public List<Score> queryAll() {
        return scoreMapper.selectByExample(new ScoreExample());
    }

    @Override
    public void updateScore(User user, int scoreCount) {

    }

    @Override
    public List<Score> queryLimit(int offset, int limit) {
        return null;
    }
}
