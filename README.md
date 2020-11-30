# lab3.2
实验三UI组件的第二小题
实验截图：https://github.com/1234567Olive/lab3.2/blob/master/3.2.png
实验思路：
1、创建LayoutInflater
 LayoutInflater li=LayoutInflater.from(this);
2、填充布局
View quakeDetailsView=li.inflate(R.layout.quake_details, null);
3、创建AlertDialog
AlertDialog.Builder quakeDialog=new AlertDialog.Builder(this);
AlertDialog的构造函数都是protect的，android只提供了AlertDialog.Builder来构造AlertDialog
4、设置AlertDialog自定义视图
quakeDialog.setView(quakeDetailsView);
5、返回Dialog
quakeDialog.create();
