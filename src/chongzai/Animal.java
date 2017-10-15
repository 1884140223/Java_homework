package chongzai;
/**
 * 构造方法的重载
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Animal {
	private String name;	//动物名
	private String color;	//毛发颜色
	private String train;	//动物品种
	public Animal(){		//无参构造方法
		name="旺财";
		color="棕色";
		train="泰迪";
	}
	/*	返回狗狗的基本信息	*/
	public String print(){
		String str="姓名："+name+"\t我是一只"+color+"的"+train;
		return str;
	}
	public String print(String name){
		this.name=name;
		String str="姓名："+name+"\t我是一只"+color+"的"+train;
		return str;
	}
}
