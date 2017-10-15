package chongzai;
/**
 * 手机类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Phone {
	private String name="华为";			//手机品牌
	private String type="华为荣耀V9";		//手机型号
	private String brand="智能手机";		//手机类型
	public String print(){				/*方法print():返回手机的基本信息*/
		String str="手机品牌："+name+"\t手机型号："+type+"\t手机类型："+brand;
		return str;
	}
	
	/*	对方法print()进行方法重载	*/
	public String print(String name,String type,String brand){
		this.name=name;
		this.type=type;
		this.brand=brand;
		String str="手机品牌："+name+"\t手机型号："+type+"\t手机类型："+brand;
		return str;
	}
}
