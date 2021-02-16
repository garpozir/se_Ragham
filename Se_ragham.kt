//برنامه جدا کردن سه رقمی اعداد با زبان کاتلین
//سازنده: بهروز غلامی اشرف
//Gmail: garpozir@gmail.com
//github: garpozir

fun main() {
	print("Adad_Ra_Vared_Konid\t");
	var adad: Long = readLine()!!.toLong();
	if (adad.toString().length > 12 || adad < 0) {
		print("Adad_Bozorg_Ya_Koochak!!!");
		return;
	}
	if (adad < 1000) {
		print(adad);
		return;
	}
	var sep: Char = ',';
	var part: String;
	var chap: String = "";
	var full = arrayOf("");
	var Index: Int;
	var besh: Int = 0;
	var lop: Int = adad.toString().length / 3;
	if (adad.toString().length % 3 != 0) lop++;
	for (i in 1..lop) {
		if (i == lop) {
			Index = (adad.toString().length) - ((i - 1) * 3);
			part = (adad.toString().subSequence(0, Index)).toString();
		} else {
			Index = ((adad.toString().length) - (i * 3)) + 1;
			part = (adad.toString().subSequence(Index - 1, adad.toString().length - besh)).toString(); besh += 3;
		}
		full += part;
	}
	for (i in lop downTo 1) {
		if (full[i] != "") chap += full[i] + sep;
	}
	println(chap.replaceRange(chap.length - 1, chap.length, ""));
}