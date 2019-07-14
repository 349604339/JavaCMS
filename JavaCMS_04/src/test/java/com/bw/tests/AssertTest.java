/**
 * Create Date:2019年7月14日
 */
package com.bw.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bw.mains.AssertUtil;
import com.bw.mains.CRuntimeException;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:张涛
 * <br>Date:2019年7月14日
 */
public class AssertTest {
  @Test
  public void fun1Test() {
    try {
      AssertUtil.isTrue(false, "错");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun2Test() {
    try {
      AssertUtil.isFalse(true, "对");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun3Test() {
    try {
      AssertUtil.isNotNull("", "不是字符串");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun4Test() {
    try {
      AssertUtil.isNull(" ", "是字符串");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun5Test() {
    try {
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      arrayList.add(55);
      AssertUtil.collectionNotNull(arrayList, "不是集合");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun6Test() {
    try {
      Map<Integer, String> hashmap = new HashMap<Integer, String>();
      hashmap.put(44, "13");
      AssertUtil.mapNotNull(hashmap, "不是集合");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun7Test() {
    try {
      AssertUtil.isLength("sdf rdgds gs", "不是字符串");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  @Test
  public void fun8Test() {
    try {
      AssertUtil.absint(0, "不是整数");
    } catch (CRuntimeException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
