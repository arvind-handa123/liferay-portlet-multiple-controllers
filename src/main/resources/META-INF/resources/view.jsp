<%@ include file="init.jsp" %>

<portlet:renderURL  var="mvcRenderRequestURL" windowState="normal">
	<portlet:param name="mvcRenderCommandName" value="/mvc_render_req_url"/>
</portlet:renderURL>
<liferay-portlet:actionURL name="mvc_action_req_url" var="mvcActionRequestURL">
     <portlet:param name="mvcActionCommand" value="mvc_action_req_url" /> 
</liferay-portlet:actionURL>
<portlet:resourceURL var="mvcResourceRequestURL" id="/mvc_resource_req_url"/>

<div class="container">
	<div class="row">
		<div class="col-md-12">
			<b>Action :</b> <div id="actionName"><b>${actionName}</b></div>
		</div>
	</div>
	<hr/>
	<div class="row">
		<div class="col-md-4">
			<aui:form name="frm" action="${mvcActionRequestURL}">
				<div class="row">
					<aui:input name="action" value="It's demo"></aui:input>
				</div>
				<div class="row">
					<aui:button type="submit" name="save" cssClass="btn btn-primary btn-block" value="btn-portlet-action-label"></aui:button>
				</div>
			</aui:form>
		</div>
		<div class="col-md-4">
			<aui:a href="${mvcRenderRequestURL}" cssClass="btn btn-info btn-block"><liferay-ui:message key="btn-portlet-render-label" /></aui:a>
		</div>
		<div class="col-md-4">
			<aui:a href="" onClick="CallResourceRequest()" cssClass="btn btn-default btn-block"><liferay-ui:message key="btn-portlet-resource-label" /></aui:a>
		</div>
	</div>
</div>

<script type="text/javascript">

	function CallResourceRequest () {
		 $.ajax({
		    url : "${mvcResourceRequestURL}",
		    contentType: false,
	        processData: false,
		    cache: false,
		    async : false,
		    success: function(data){
		    	$("#actionName").empty();
		    	$("#actionName").html('<b>'+data+'</b>');
		    }
		});	 
	}
		
</script>