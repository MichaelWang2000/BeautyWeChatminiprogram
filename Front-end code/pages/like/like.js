// pages[表情]ke[表情]ke.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "data":[]
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
      var that = this;
      var id = 0;
      wx.request({
        url: 'http://localhost:8080/sysuser/pro/'+id,
        method:"GET",
        success:function(res){
          that.setData({
            "data":res.data.data,
          })
        }
      })
    },
  
  })