package chongzai;
/**
 * 个人信息类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Person {
	private String name="小明";		//姓名
	private String sex="男";			//性别
	private String city="北京";		//家乡城市
	public String print(){			/*方法print():返回个人基本信息的字符串*/
		String str="我叫："+name+"\t性别："+sex+"\t我家在："+city;
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String city){
		this.city=city;
		String str="我叫："+name+"\t性别："+sex+"\t我家在："+city;
		return str;
	}
	
}
