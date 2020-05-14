ဖုန်းတွေကို မြန်မာစာ မှန်အောင် ( zawgyi ,uni ) ဒီ libလေးကိူ အဆင်သင့်အသုံးပြုနိုင်ပါတယ်
embed fontကို MyMyanmarX.ttf ကိုသုံးထားပါတယ်

အဆင့် ၁
build.gradle(root) အောက်မှာ
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
ဘာကြောင့်လဲဆိုတော့ ကျွန်တော်တို့ module project ကို jitpack.io မှာတင်ထားတာဖြစ်လို့ပါ

အဆင့် ၂
build.gradle (app)  အောက်မှာ ဒီအကြောင်းလေးထည့်ပေးပါ

dependencies {
	        implementation 'com.github.mgkaung692018:myanmar_font_detect:1.02'
	              }
ပထမဆုံး lib ထုတ်တာစမ်းထားတော့ implementation ကို ခေါရတာ ရှည်သလို လေးတော့ဖစ်နေမာ 


