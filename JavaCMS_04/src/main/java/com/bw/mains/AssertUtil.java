/**
 * Create Date:2019年7月14日
 */
package com.bw.mains;

import java.util.Collection;
import java.util.Map;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:张涛
 * <br>Date:2019年7月14日
 */
public class AssertUtil {
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   * @param exp
   * @param message
   */
  public static void isTrue(boolean exp, String message) {
    if (!exp) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   * @param exp
   * @param message
   */
  public static void isFalse(boolean exp, String message) {
    if (exp) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   * @param exp
   * @param message
   */
  public static void isNotNull(String exp, String message) {
    if (exp == null || exp.length() == 0) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   * @param exp
   * @param message
   */
  public static void isNull(String exp, String message) {
    if (exp.length() > 0) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   */
  public static void collectionNotNull(Collection<?> col, String message) {
    if (col == null || col.size() == 0) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   */
  public static void mapNotNull(Map<?, ?> map, String message) {
    if (map == null || map.size() == 0) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   * @param exp
   * @param message
   */
  public static void isLength(String exp, String message) {
    if (!(exp.trim().length() > 0)) {
      throw new CRuntimeException(message);
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:张涛
   * <br>Date:2019年7月14日
   * @param exp
   * @param message
   */
  public static void absint(int exp, String message) {
    if (exp <= 0) {
      throw new CRuntimeException(message);
    }
  }
}
