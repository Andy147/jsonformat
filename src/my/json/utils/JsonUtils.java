package my.json.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils
{
	/**
	 * 判断是否是json格式
	 * @param str
	 * @return
	 */
	public static boolean isJson(String str)
	{
		
		try
		{
			JSONObject json = new JSONObject(str);
		} catch (Exception e)
		{
			return false;
		}
		return true;
	}
	/**
	 * 判断是否是json数组
	 * @param str
	 * @return
	 */
	public static boolean isJSONArr(String str)
	{
		try
		{
			JSONArray json = new JSONArray(str);
		} catch (Exception e)
		{
			return false;
		}
		return true;
	}

}
