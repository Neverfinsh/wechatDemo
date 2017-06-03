import Decoder.BASE64Decoder;


public class GetGPS {
	
	public static void main(String[] args) {
		System.out.println("测试");
		System.out.println(GetGPS.getFromBASE64("MTEzLjU1MTgwNzMxMzgx","MjMuNTIxMjI3NjcwMjE0"));
		
	}

	
	
	public static String getFromBASE64(String s,String sa) { 
		
		BASE64Decoder decoder = new BASE64Decoder(); 
		try { 
		byte[] b = decoder.decodeBuffer(s);
		byte[] b1 = decoder.decodeBuffer(sa); 
		return new String(b)+ "&&"+ new String(b1);
		
		} catch (Exception e) { 
			 System.out.println("解析错误");
	     	return "失败"; 
		} 
		
	}

}
