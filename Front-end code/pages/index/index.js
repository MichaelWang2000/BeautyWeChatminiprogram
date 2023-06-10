//new page

Page({
    data:{
  "banner":[],
  "nav":[],
  "sub":[]
    },
  
    onLoad:function(options){
      var that = this
      //ajak 
  wx.request({
    url: 'http://localhost:8080/image/banner',
    method:"GET",
    success:function(res){
      //console.log(res);
    
     that.setData({
       "banner":res.data.data
     })
    }
  })

  wx.request({
    url: 'http://localhost:8080/image/nav',
    method:"GET",
    success:function(res){
      //console.log(res);
      that.setData({
        "nav":res.data.data
      })
    }
    })

    wx.request({
        url: 'http://localhost:8080/project/pro/推荐',
        method:"GET",
        success:function(res){
        // console.log(res);
          that.setData({
            "sub":res.data.data
          })
        }
        })
},

    //自定义函数 方法 点击事件
    toOrder:function(options){
        // console.log(options);
        var image = options.currentTarget.dataset.img;
        var proname = options.currentTarget.dataset.proname;
        var pid = options.currentTarget.dataset.id;
        wx.navigateTo({
          url: '/pages/order/order?image='+image+'&proname='+proname+'&id='+pid,
        })
    },

  navpro:function(options){
    var that = this;
    var navname = options.currentTarget.dataset.name;
    // console.log(navname);

    wx.request({
      url: 'http://localhost:8080/project/pro/'+navname,
      method:"GET",
        success:function(res){
            // console.log(res);
            that.setData({
                "sub":res.data.data
            })
        }
    })
  },

  todetail:function(options){
      var that = this;
    //   console.log(options);
        var id = options.currentTarget.dataset.id;
        var image = options.currentTarget.dataset.img;
        wx.navigateTo({
          url: '/pages/detail/detail?id='+id+'&image='+image,
        })
  }
})


