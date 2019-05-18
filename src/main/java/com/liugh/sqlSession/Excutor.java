package com.liugh.sqlSession;

public interface Excutor {
	 <T> T query(String statement,Object parameter);//<T>
}
