#ဖုန်းတွေကို မြန်မာစာ မှန်အောင် ( zawgyi ,uni ) ဒီ libလေးကိူ အဆင်သင့်အသုံးပြုနိုင်ပါတယ်
embed fontကို MyMyanmarX.ttf ကိုသုံးထားပါတယ်
<block>
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
</block>


အသုံးပြုနည်းကတော့ရိုးရှင်းပါတယ်


အသုံးပြုနည်းကတော့ရိုးရှင်းပါတယ်

<block>
TextView လို့ သူံးမဲ့အစား MMTextView ကိုသုံးရမှာပါ 
EditText  လို့ သူံးမဲ့အစား MMEditText ကိုသုံးရမှာပါ 
Button လို့ သူံးမဲ့အစား MMButton ကိုသုံးရမှာပါ 
BottomNavigation  လို့ သူံးမဲ့အစား MMBottomNavigation ကိုသုံးရမှာပါ 
NavigationDrawer   လို့ သူံးမဲ့အစား MMNavigationDrawer ကိုသုံးရမှာပါ 
Progressbar  လို့ သူံးမဲ့အစား MMProgressbar ကိုသုံးရမှာပါ 
Dialog လို့ သူံးမဲ့အစား MMDialog ကိုသုံးရမှာပါ 
</block>

