// pages/Torder/Torder.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "date":"2022-07-09",
      "time":"11:11",
      "tech":[]
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
      // console.log(options);
      var that = this;
      var tid = options.tid;
      var tname = options.tname;
      wx.request({
        url: 'http://localhost:8080/technician/teach/teacher/'+tname,
        method: "GET",
  
        success:function(res){
          // console.log(res)
          that.setData({
            "tech": res.data.data[0]
          })
        }
      })
      
    },
  
  
    // 自定义方法
    bindDateChange:function(options){
      
      this.setData({
        "date":options.detail.value
      })
    },
  
    bindTimeChange:function(options){
      
      this.setData({
        "time":options.detail.value
      })
    },
  
    formSubmit:function(options){
      var that = this;
      wx.request({
        url: 'http://localhost:8080/order/app/teachorder',
        method: "POST",
        data: {
          "makedate": that.data.date+' '+that.data.time,
          "username":options.detail.value.username,
          "usertell":options.detail.value.usertell,
          "information":options.detail.value.information,
          "tecid": that.data.tech.id
        },
  
        success:function(res){
          wx.switchTab({
            url: '/pages/index/index',
          })
        }
  
      })
    },
  
    
  })