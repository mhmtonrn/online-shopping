<div class="container">
	<div class="row">
	<!-- for side bar -->
		<div class="col-md-3">
		<%@include file="./shared/sidebar.jsp" %>
		
		</div>
		
		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">
				<c:if test="${userClickAllProducts == true}">
				
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
						<li class="breadcrumb-item active"> <a href="#">All Products</a></li>
					</ol>
					
				</c:if>
				
				<c:if test="${userClickCategoryProducts == true}">
				
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
						<li class="breadcrumb-item active"> <a href="#">Category</a></li>
						<li class="breadcrumb-item active"> <a href="${contextRoot}/show/category/${category.id}/products">${category.name}</a> </li>
					</ol>
					
				</c:if>
					
				</div>
			</div>
		</div>
	</div>
</div>