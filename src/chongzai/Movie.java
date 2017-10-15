package chongzai;
/**
 * 电影类
 * 方法名相同
 * 参数列表不同(个数，类型，排列顺序)
 * 与访问修饰符、返回类型无关
 * @author Administrator
 *
 */
public class Movie {
	private String name="战狼2";			//电影名
	private String person="吴京";			//电影导演
	public String print(){				/*方法print():返回电影与其导演*/
		String str=name+"是由"+person+"导演的";
		return str;
	}
	
	/*	对方法prin()进行方法重载	*/
	public String print(String name,String person){
		this.name=name;
		this.person=person;
		String str=name+"是由"+person+"导演的";
		return str;
	}
}
