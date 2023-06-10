// pages/teach/teach.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "teachers":[]
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
      
      var that = this;
      wx.request({
        url: 'http://localhost:8080/technician/teach/teacher/我全都要',
        method: "GET",
        success:function(res){
          //将获取到的数据放入data
          that.setData({
            "teachers":res.data.data
          })
        }
      })
    },
  
    toDetail:function(options){
  
      // console.log(options)
      var that = this;
      var teachername = options.currentTarget.dataset.name;
      var tecid = options.currentTarget.dataset.id;
      wx.navigateTo({
        url: '/pages/Tdetail/Tdetail?name='+teachername+'&id='+tecid,
      })
    },
  
    formSubmit:function(options){
      var that = this;
      console.log(options);
      var techname = options.detail.value.techname;
      wx.request({
        url: 'http://localhost:8080/technician/teach/teacher/'+techname,
        method: "GET",
        success:function(res){
          //将获取到的数据放入data
          that.setData({
            "teachers":res.data.data
          })
        }
      })
    }
    
  })