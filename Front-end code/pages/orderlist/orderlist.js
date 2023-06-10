// pages/orderlist/orderlist.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "data":[],
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
      var that = this;
      var username = options.username;
      wx.request({
        url: 'http://localhost:8080/order/pro/'+username,
        method:"GET",
        success:function(res){
          console.log(res)
          that.setData({
            "data":res.data.data,
          })
        }
      })
    },
  })