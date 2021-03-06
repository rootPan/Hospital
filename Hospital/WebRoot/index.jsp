<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>医者天下</title>
    <!--[if IE]>
		<script src="js/html5.js"></script>
	<![endif]-->

    <base target="_self">
    <link rel="stylesheet" href="css/index.css" />
    <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript">
    	
    	function login(){
    		var n = $('#username').val();
    		var p = $('#pwd').val();
    		if(n==''){
    			alert('请输入用户名');
    		}
    		else if(p==''){
    			alert('请输入密码');
    		}
    		else{
    			$('#login_frm').submit();
    		}
    	}
    	
    	$(function(){
    		$('#querySearch').click(function(){
    			$('#med_form').submit();
    		});
    	});
    	
    </script>
    
</head>
<body>
    <header id="fastTop" class="header">
        <div class="search_box">
            <span class="logo">
                <a href="index.htm">
                    <img src="images/logo.jpg"></a>
            </span>
           
            <div class="keyword">
                <form method="post" id="med_form" action="selHosp" onKeyDown="if(event.keyCode==13)return false;">
                    <input type="text" name="hname" autocomplete="off" placeholder="请输入医院名称" 
                    	id="search-tips-input" value="">
                    <button type="button" class="btn-doctor" id="querySearch">搜&nbsp;索</button>
                </form>
                <div class="search-suggest-layer" style="display: none; border: 1px #eaeaea solid; margin-top: -2px; width: 466px; background-color: #fff; border-bottom-left-radius: 4px; border-bottom-right-radius: 4px; position: absolute; z-index: 1;"></div>
            </div>
            <div class="login">
            <c:if test="${empty userlogin}">
            	<div class="my-doctor">
                	
                		<div style="float: left;color:#2896f3;">
                		<form id="login_frm" action="login" method="post">
                			<div>用户名：<input type="text" name="username" id="username" style="border: 1px solid #2896f3;"/></div>
                			<div style="margin-top:2px">密&nbsp;码：<input type="password" name="pwd" id="pwd" style="border: 1px solid #2896f3; width: 152px"/></div>
                		</form>
                		</div>
                		<div style="float: right;line-height:42px;margin-left:15px">
                			<div><input type="button" value="登&nbsp;录" onClick="login()" 
                				style="width:60px;height:40px;cursor:pointer;border: 1px solid #2896f3;color:#2896f3;"></input>
                				
                			</div>
                		</div>
                </div>
            </c:if>
            <c:if test="${not empty userlogin }">
            	<div>${userlogin.username}欢迎您！<span><a href="loginOut">退出登录</a></span></div>
            </c:if>
            </div>
        </div>
    </header>
    <div class="banner">
        <div class="banner-content">
            <ul class="banner-left">
                <a href="index.jsp">
                    <li class="active">首页</li>
                </a>
                <a href="sel_Hospitalsg">
                    <li>找医院</li>
                </a>
                <a href="selMed?title=">
                    <li>找医生</li>
                </a>
            </ul>
        </div>
    </div>
    <div class="opacity"></div>
    <div class="carousel-infos">
        <div id="slideBox" class="slideBox">
            <div class="hd car-item">
				<ul><li class=""></li><li class=""></li><li class="on"></li></ul>
			</div>
            <div class="bd">
				<ul>
					<li style="display: none;"><a href="#" target="_blank"><img src="images/banner1.jpg"></a></li>
					<li style="display: none;"><a href="#" target="_blank"><img src="images/banner2.jpg"></a></li>
					<li style="display: list-item;"><a href="#" target="_blank"><img src="images/banner3.jpg"></a></li>
				</ul>
			</div>
        </div>

        <div class="wrap">
            <div class="container">

                <!-- 推荐医院-->
                <div class="find-hospital">
                    <h3>
                        <ul class="tab">
                            <li class="first-tab">医院推荐</li>
                        </ul>
                        <a id="hos-more" href="sel_Hospitalsg" target="_blank"><span class="more-hos">查看全部<img src="images/arrow_normal.png"></span></a></h3>
                    <div class="content" id="cityTab">
                        <ul>
                        <c:forEach items="${hospitals}" var="hos" begin="0" end="2">
                            <li class="hospital-detail"><a href="#" target="_blank">
                                <img src="images/d31b0ef41bd5ad6ee0d4c29787cb39dbb6fd3c99.jpg" alt="武汉同济医院" width="230" height="120"></a><p class="hospital-name"><a href="selHname?hname=${hos.hname }" title="武汉同济医院" target="_blank"><span class="span-name">${hos.hname }</span></a><i class="star-right star-light star-fixed"></i><i class="star-right star-light star-fixed"></i><i class="star-right star-light star-fixed"></i><i class="star-right star-light star-fixed"></i><i class="star-right star-light star-fixed"></i><span class="grade-text ">9.8</span><label class="hospital-grade"><span class="grade">${hos.grade}</span><span class="corpt">医保</span></label></p>
                                <p class="appointent_total">
                                    <label class="label-right"><span>${hos.count}</span>&nbsp;人成功预约</label>
                                </p>
                            </li>
                          </c:forEach>
                        </ul>
                        <ul class="hospital-info">
                        	<c:forEach items="${hospitals}" var="list" begin="3">
                            	<li><a href="#" title="${list.hname }" target="_blank"><span class="span-hospital ">${list.hname }</span></a><label><span class="span-grade">${list.grade}</span><span class="span-corpt">[医保]</span></label></li>
                      		</c:forEach>
                      	</ul>
                    </div>
                </div>
                <!-- END推荐医院-->

                <!-- 热门科室-->
                <div class="hot-department">
                    <h3>热门科室</h3>
                    <div class="content">
                        <ul>
                        	<c:forEach items="${deptMaps}" var="item" begin="0" end="1">
                            <li class="first-info">
                                <div class="dep-left"><a target="_self" class="dep-title" href="#"><b>${item.key}</b></a></div>
                                <div class="dep-right">
                                	<c:forEach items="${item.value}" var="de">
                                	<a class="dep-item dep-light" href="#" target="_self" title="心血管内科">${de.dname}</a>
                            		</c:forEach>
                            	</div>
                            </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
                <!-- END热门科室-->

                <!-- 优质医生-->
                <div id="excel-doctor-div" class="excel-doctor">
                    <h3>名师名医<a href="mediciner/doctor_list.htm" target="_blank"><span>更多名医<img src="images/arrow_normal.png"></span></a></h3>
                    <div class="content slideBox2">
                        <div id="pre-arrow" class="pre-arrow prev">
                            <img data-gray="images/pre_disable.png" data-srchover="images/pre_hover.png" data-src="images/pre_normal.png" src="images/pre_disable.png">
                        </div>
                        <div class="doctail-detail bd">
                            <ul id="dictor-list-ul">
                               
                               <c:forEach items="${mediciners}" var="med">
                                <li class="doctor-first" style="background-color: rgb(249, 249, 249);">
                                	<a href="#" target="_blank">
                                    	<img src="images/yisheng1.png">
                                    </a>
                                    <p><a target="_blank" href="#"><span>${med.mname}</span></a>&nbsp;<span class="doctor-level">${med.title}</span></p>
                                    <p>${med.dept}</p>
                                    <p title="${med.hospital}">${med.hospital}</p>
                                    <p class="btn-appoint"><a target="_blank" href="#"><span style="border-color: rgb(1, 151, 241); color: rgb(255, 255, 255); background-color: rgb(1, 151, 241);">一键预约</span></a></p>
                                </li>
                                </c:forEach>
                            </ul>
                        </div>
                        <div id="next-arrow" class="next-arrow next">
                            <img data-gray="images/arrow_disable.png" data-srchover="images/arrow_hover.png" data-src="images/arrow_normal.png" src="images/arrow_disable.png">
                        </div>
                    </div>
                </div>
                <!-- END优质医生-->


                

            </div>
            <div class="right-sidebar-info">
                <!-- 右侧统计信息 -->
                <div class="res-info">
                    <div class="city-info">
                        <h3 class="res-title">全国已开通</h3>
                     <i class="num">${count}</i>家医院
                    </div>
                    <div class="num-info">
                        <h3 class="res-title">可预约医生数</h3>
                        <!-- 循环可预约医生数量 -->
                        
                        	<div class="img-container">
                        		 <img src="images/number_bg.png" class="number-bg "><i class="num">${count1}</i>
                        	</div>
                        
                    </div>
                    <div class="num-info">
                        <h3 class="res-title">累计服务人数</h3>
                        <!-- 累计服务人数 -->
                       
                        	<div class="img-container">
                           		<img src="images/number_bg.png" class="number-bg "><i class="num">${count2}</i>
                        	</div>
                        
                    </div>
                </div>
                <!-- END右侧统计信息 -->

                <!-- 合作机构 -->
                <div class="news">
                    <h3 class="news-title">合作机构</h3>
                    <ul class="news-list">
                    <c:forEach items="${hospitals}" var="hos">
                        <li>
                            <a href="#" target="_blank">
                            	${hos.hname}
                            </a>
                           
                        </li>
                    </c:forEach>
                    </ul>
                </div>
               <!-- END合作机构 -->
            </div>
        </div>
    </div>

    <footer id="footer-three" class="footer-box footer-three clear path" data-src="http://dpp.bdimg.com/static/pc/201604261639/asset" data-href="" data-api="http://yi.baidu.com" data-passport="https://passport.baidu.com">
        <div class="footer-con">
            <div class="footer-info-url">
                <dd class="fo-link">
                    <a href="#" target="_blank"><span>帮助</span>|</a>
                    <a href="#" target="_blank"><span>用户协议</span>|</a>
                    <a href="#" target="_blank"><span>意见反馈</span></a>
                    <a href="#" target="_blank"><span>©2016 Mstanford &nbsp;&nbsp;隐私条款</span></a>
                </dd>
            </div>
    </footer>



    <script src="js/jquery-1.11.2.min.js"></script>

    <script src="js/uni_login_wrapper.js"></script>

       <script src="js/jquery.SuperSlide.2.1.1.js"></script>

    <script type="text/javascript">
        jQuery(".slideBox").slide({ mainCell: ".bd ul", autoPlay: true});

        jQuery(".slideBox2").slide({ mainCell: ".bd ul", vis: 4, scroll: 4, effect: "left", autoPlay: false ,pnLoop:false});

    
    </script>
</body>
</html>
