package com.spring.withwork.service;

import java.util.List;

import com.spring.withwork.vo.ProjectVO;
import com.spring.withwork.vo.SearchProject;

public interface RoadmapService {

	public int insertProject(ProjectVO prj);

	public List<ProjectVO> prjList();

	public ProjectVO getPrj(String p_num);

	public List<ProjectVO> managerList(int c_num);

	public int updateProject(ProjectVO prj);

	public List<ProjectVO> searchProject(SearchProject sp);

}
