<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
	<div class="wrapper">
		<div>
			<tiles:insertAttribute name="header" />
		</div>
		<div>
			<tiles:insertAttribute name="body" />
		</div>
		<div>
			<tiles:insertAttribute name="footer" />
		</div>
	</div>

</body>
</html>