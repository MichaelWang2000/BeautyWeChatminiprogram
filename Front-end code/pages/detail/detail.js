// pages/detail/detail.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "proInfo":[],
      "image":"",
      "likeInfo":[]
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
      var that = this;
      var pid = options.id;
      var image = options.image;
  
      //发送请求
      wx.request({
        url: 'http://localhost:8080/project/detail/'+pid,
        //请求方式
        method:"GET",
        success:function(res){
          that.setData({
            "proInfo":res.data.data,
            "image":image
          })
        }
      })
    },
  
    //跳转方法
    toOrder(options){
      var image = options.currentTarget.dataset.img;
      var proname = options.currentTarget.dataset.proname;
      var id = options.currentTarget.dataset.id;
      wx.navigateTo({
        url: '/pages/order/order?image='+image+'&proname='+proname+'&id='+id,
      })
    },
    
    //添加收藏
    like(options){
      var that = this;
      var id = that.data.proInfo.id;
      wx.request({
        url: 'http://localhost:8080/sysuser/app/Sysuser',
        method:"POST",
        data:{
          "id":id,
        }
      })
    }
  
  })