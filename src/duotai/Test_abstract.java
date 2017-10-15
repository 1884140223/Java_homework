package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Test_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 动物类
		 */
		Animal_abstract animal=new Animal_abstract_dog();
//		Animal_abstract animal=new Animal_abstract_cat();
		Animal_abstract_com animal_com=new Animal_abstract_com();
		System.out.println(animal_com.show(animal));
		
		/**
		 * 车类
		 */
		Car_abstract car=new Car_abstract_bus();
//		Car_abstract car=new Car_abstract_car();
		Car_abstract_com car_com=new Car_abstract_com();
		System.out.println(car_com.show(car));
		
		/**
		 * 电视类
		 */
		TV_abstract tv =new TV_abstract_color();
//		TV_abstract tv =new TV_abstract_black();
		TV_abstract_com tv_com=new TV_abstract_com();
		System.out.println(tv_com.show(tv));
		
		/**
		 * 家、房间类
		 */
		Home_abstract home=new Home_abstract_bedroom();
//		Home_abstract home=new Home_abstract_bookroom();
		Home_abstract_com home_com=new Home_abstract_com();
		System.out.println(home_com.show(home));
		
		/**
		 * 旅游类
		 */
		Lvyou_abstract city=new Lvyou_abstract_city();
//		Lvyou_abstract city=new Lvyou_abstract_citys();
		Lvyou_abstract_com city_com=new Lvyou_abstract_com();
		System.out.println(city_com.show(city));
		
		/**
		 * play类
		 */
		Play_abstract play=new Play_abstract_zi1();
//		Play_abstract play=new Play_abstract_zi2();
		Play_abstract_com play_com=new Play_abstract_com();
		System.out.println(play_com.show(play));
		
		/**
		 * music音乐类
		 */
		Music_abstract music=new Music_abstract_zi1();
//		Music_abstract music=new Music_abstract_zi2();
		Music_abstract_com music_com=new Music_abstract_com();
		System.out.println(music_com.show(music));
		
		
		
		/**
		 * 游戏类	Game
		 */
		Game_abstract_com game=new Game_abstract_com();
		String trr=game.show(1).show();
		System.out.println(trr);
		
		
		
		/**
		 * 书籍类			使用父类作为返回值
		 */
		Book_abstract_com book=new Book_abstract_com();
		String str=book.show(1).show();
		System.out.println(str);
		
		/**
		 * 工作类			使用父类作为返回值
		 */
		Work_abstrance_com work=new Work_abstrance_com();
		String strs=work.show(1).show();
		System.out.println(strs);
		
		
		
	}

}
