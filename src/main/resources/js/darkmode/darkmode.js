// .js

const darkModeData = {

    isActive: false,
    mode: "黑暗模式"
};


const darkMode = {
    darkMode: function () {
        // alert("darkMode 启动")

        if (this.dark.isActive) {
            this.dark.isActive = false;
            document.querySelector('body').removeAttribute('style')
            this.dark.mode = "黑暗模式"
        } else {
            //开启黑暗模式
            this.dark.isActive = true;
            document.querySelector('body').setAttribute('style', 'background-color:#000');
            this.dark.mode = "白天模式"
        }
    }
};

