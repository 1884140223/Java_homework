package chongzai;
/**
 * 学生类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Student {
	private String name="李明";		//学生姓名
	private String number="1234567";		//学生学号
	private String school="北大青鸟";		//所在学校	
	public String print(){				/*方法print():返回学生的基本信息*/
		String str="我叫："+name+"\t学号为："+number+"\t我在"+school+"学习";
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String school){
		this.school=school;
		String str="我叫："+name+"\t学号为："+number+"\t我在"+school+"学习";
		return str;
	}
}
