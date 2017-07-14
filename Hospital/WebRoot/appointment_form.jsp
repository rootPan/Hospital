<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8" http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>医者天下</title>
    <link rel="stylesheet" href="css/appointment_form.css" />
    <style>
        .header .top-box .top-icon-img {
            width: 13px;
            height: 13px;
            vertical-align: middle;
            margin-bottom: 3px;
        }

        .header .top-box .sign a {
            color: #0c81f8;
            cursor: pointer;
        }
    </style>
    
</head>
<body>
    <header class="header">
        <header id="fastTop" class="header" style="height: 100px;">
            <div class="search_box">
                <span class="logo">
                    <a href="index.htm">
                        <img src="allHospital"></a>
                </span>
                <input type="hidden" id="current-area-info" data-province="16" data-city="371" data-region="0" data-provtag="0" data-value="1">


            </div>
        </header>
    </header>

    <div class="wrap">
        <div class="title">
            <p><a href="index.htm">首页</a> &gt; <a href="javascript:history.back()">医生详情页</a> &gt; 填写预约信息</p>
        </div>
        <div class="container">
            <p class="doctor-title">已选择的医生</p>
            <div class="doctor-info">
                <div class="info-pic">
                    <img src="images/yisheng1.png">
                </div>
                <div class="infos">
                    <div class="info-title">
                        <div>${mediciner.mname}</div>
                        <div class="info-doc"><i></i><span>认证医生</span><span class="doctor-medtitle">${mediciner.title}&nbsp;/&nbsp;${mediciner.gender}</span></div>
                    </div>
                    <p class="info-hospittal"><span>${mediciner.hospital}</span>${mediciner.dept}</p>
                </div>
                <div class="time-and-pay">
                    <span class="info-time"><span>就诊时间：</span>${time}</span><br>
                    <span class="pay-info"></span>
                </div>
            </div>
            <div class="write-list">
                <p class="doctor-title">请填写预约信息(真实有效)<span>(输入的预约信息，我们将为你保密)</span><span class="right-info"><span>*</span>为必填项</span></p>
                <form id="appForm" action="addApp" method="post">
                <input type="hidden" name="mid" value="${mediciner.mid}" />
                <input type="hidden" name="uid" value="${userlogin.uid}" >
                <input type="hidden" name="time" value="${time}" />
                <table>
                    <tbody>
                        <tr>
                            <td class="label">就诊人</td>
                            <td class="essential-mark"><span class="star-red">*</span></td>
                            <td>
                                <div class="widget-input" id="widget-input-name">
                                    <input type="text" id="patientName" name="patientName" value="">
                                    <span class="right" style="display: none;"><i class="instant-state fa fa-check-circle"></i></span>
                                    <span class="wrong" style="display: none;"><i class="instant-state fa fa-times-circle"></i><i id="name-wrong-info">请输入姓名</i></span>
                                </div>
                            </td>
                        </tr>
                        <tr id="id-card-tr">
                            <td class="label">身份证号</td>
                            <td class="essential-mark"><span class="star-red">*</span></td>
                            <td>
                                <div class="widget-input" id="widget-input-identity">
                                    <input type="text" id="patientIdentity" name="patientIdentity" value="">
                                    <span class="right" style="display: none;"><i class="instant-state fa fa-check-circle"></i></span>
                                    <span class="wrong" style="display: none;"><i class="instant-state fa fa-times-circle"></i><i id="idcard-wrong-info">请输入身份证号</i></span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="label">联系手机</td>
                            <td class="essential-mark"><span class="star-red">*</span></td>
                            <td>
                                <div class="widget-input" id="widget-input-phone">
                                    <input type="text" id="patientPhone" name="patientPhone" value="">
                                    <span class="right" style="display: none;"><i class="instant-state fa fa-check-circle"></i></span>
                                    <span class="wrong" style="display: none;"><i class="instant-state fa fa-times-circle"></i><i id="phone-wrong-info">请正确输入手机号</i></span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td>
                                <div class="widget-input">
                                    <input id="agreement" type="checkbox" checked="checked" value=""><label for="agreement">同意</label><span class="agreement"><a href="#" target="_blank">《医者天下用户协议》</a></span><span class="wrong widget-wrong" style="display: none"><i class="instant-state fa fa-times-circle"></i><i>您还未同意用户协议</i></span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td>
                                <div class="widget-input submit-button" style="margin-top: -5px;"><span id="submit-order" class="submit-but action">提交预约单</span></div>
                            </td>
                        </tr>
                    </tbody>
                </table>
                </form>
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
    <script src="js/esl.js"></script>
    <script src="js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript">
		
			$('#submit-order').click(function(){
				
				
	                    	alert('恭喜您,预约成功!');
	                    	$('#appForm').submit();
	                    }
	                
	            );
			
	</script>
</body>
</html>

