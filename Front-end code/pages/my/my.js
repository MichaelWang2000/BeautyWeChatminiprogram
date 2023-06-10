Page({
    data: {
      userInfo:''
      },
      onLoad(){
       let user=wx.getStorageSync('user')
       this.setData({
        userInfo:user
      })
      },
      //授权登录
    login(){
      wx.getUserProfile({
        desc:'必须授权才能上使用',
        success:res=>{
        let user=res.userInfo
        //把用户信息缓存在本地
        wx.setStorageSync('user', user)
        this.setData({
          userInfo:user
        })
        },
        fail:res=>{
          console.log("失败",res)
        }
      })
    },
    //退出登录
    loginout(){
      this.setData({
        userInfo:''
      })
      //清理本地缓存
      wx.setStorageSync('user', null)
    },
  
    toOrderlist:function(options){
      var username = options.currentTarget.dataset.nickname;
      wx.navigateTo({
        url: '/pages/orderlist/orderlist?username='+username,
      })
    },
  
    tolike:function(options){
      var username = options.currentTarget.dataset.nickname;
      wx.navigateTo({
        url: '/pages/like/like?username='+username,
      })
    }
  })