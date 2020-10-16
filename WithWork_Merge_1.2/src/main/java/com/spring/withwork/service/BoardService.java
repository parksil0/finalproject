package com.spring.withwork.service;

import java.util.List;

import com.spring.withwork.vo.ConfirmVO;
import com.spring.withwork.vo.Criteria;

public interface BoardService {
	
	//�Խù� ��� ��ȸ
	public List<ConfirmVO> list(Criteria cri) throws Exception;
	
	//�Խù� ��� (����ó��)
	public List<ConfirmVO> list2(Criteria cri) throws Exception;
	
	public List<ConfirmVO> list3(Criteria cri) throws Exception;
	
	//�Խù� �� ����
	public int listCount() throws Exception;
	
	
}
