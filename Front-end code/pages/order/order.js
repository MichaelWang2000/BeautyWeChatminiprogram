// pages/order/order.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "busname":"",
      "image":"",
       "proname":"",
       "date":"2022-07-08",
       "time":"11:11"
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
        var that = this;
    console.log(options);
     var image = options.image;
     var name = options.proname;
     var pid = options.id;
      
     wx.request({
       url: 'http://localhost:8080/business/app/busname/'+pid,
       method:"GET",
       success:function(res){
            // console.log(res);
           that.setData({
               "image":image,
                "busname":res.data.data,
                "proname":name,
           })
       }
     })
    },
  
    bindDateChange:function(options){
        //console.log(options);
        this.setData({
            "date":options.detail.value,
        })
    },

    bindTimeChange:function(options){
        //console.log(options);
        this.setData({
                "time":options.detail.value,
        })
    },

    formSubmit:function(options){
        var that =this;
        // console.log(options);
        wx.request({
          url: 'http://localhost:8080/order/app/order',
          method:"POST",
          data:{
            "proname":that.data.proname,
            "makedate": that.data.date+' '+that.data.time,
            "username":options.detail.value.username,
            "usertell":options.detail.value.usertell,
            "information":options.detail.value.information
          },
          success:function(res){
            //   console.log(res);
              wx.switchTab({
                url: '/pages/index/index',
              })
          }
        })
    }
  })