// pages/Tdetail/Tdetail.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
      "teachers":[],
      "techtime":[]
    },
  
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad(options) {
      // console.log(options)
      var that = this;
      wx.request({
        url: 'http://localhost:8080/technician/teach/teacher/'+options.name,
        method: "GET",
  
        success:function(res){
          that.setData({
            "teachers": res.data.data[0]
          })
        }
      })
  
      wx.request({
        url: 'http://localhost:8080/technician/teacher/'+options.id,
        method: "GET",
  
        success:function(res){
            // console.log(res)
            if (res.data.data.length == 0){
              that.setData({
                "techtime": "暂无"
              })
            }
            else{
                that.setData({
                "techtime": res.data.data[0].makedate
                })
            }
        }
      })
  
      
    },
  
    toOrder:function(options){
      var tname = options.currentTarget.dataset.tname;
      var tid = options.currentTarget.dataset.tid;
      wx.navigateTo({
        url: '/pages/Torder/Torder?tname='+tname+'&tid='+tid,
      })
    }
  })