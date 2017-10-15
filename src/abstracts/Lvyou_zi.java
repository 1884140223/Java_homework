package abstracts;
/**
 * 旅游类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Lvyou_zi extends Lvyou_fu {
	private String friends;		//一起旅游的人
	private String happy;		//旅游的心情
	public Lvyou_zi(){		//子类构造方法
		super.setCity("北京");
		super.setDays("5天");
		super.setTime("2017年8月14日");
		friends="我的同学";
		happy="很开心";
	}
	public String show(){	//对父类普通方法的重写
		String str=super.getTime()+","+"我和"+friends+"在"+super.getCity()+"游玩了"+super.getDays()+
				happy;
		return str;
	}
}
