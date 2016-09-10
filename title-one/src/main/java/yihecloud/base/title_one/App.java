package yihecloud.base.title_one;

public class App {
	public static void main(String[] args) {
		int count=0;
		int[] arg = new int[4];
		arg[0]=Integer.parseInt(args[0].split(":")[0]);
		arg[1]=Integer.parseInt(args[0].split(":")[1]);
		arg[2]=Integer.parseInt(args[1].split(":")[0]);
		arg[3]=Integer.parseInt(args[1].split(":")[1]);
		String exist="";
		for (int h = arg[0]; h <= arg[2]; h++) {
			for (int m = 0; m < 60; m++) {
				if((h==arg[0] && m<arg[1]) ||(h==arg[2] && m>arg[3])){
					continue ;
				}
				double gap = (30 * h - 5.5 * m) % 360;
				if (-6.0 < gap && gap < 6.0) {
					if(exist.indexOf(h+",")==-1){
						if(h==12 && exist.indexOf("11,")>-1){
						}
						else{
							count++;
						}
					}
					exist=exist+h+",";
				}
			}
		}
		System.out.println(count);
	}
}
