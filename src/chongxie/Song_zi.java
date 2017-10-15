package chongxie;
/**
 * 歌曲类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Song_zi extends Song_fu{
	public String show(String name,String singer){	//对父类show()方法的重写
		super.setName(name);
		super.setSinger(singer);
		String str=super.getSinger()+"正在唱"+super.getName();
		return str;
	}
}
