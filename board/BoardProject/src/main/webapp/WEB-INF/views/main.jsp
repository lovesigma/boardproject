<div id="main-containner" ng-controller = 'mainCtrl'>
	<div style="width:50%">
		<div ng-controller = 'WriteCtrl'>
			
			<div class="row">
			<label class="col-md-3">Title</label><input class="col-md-9"type ="text" ng-model="title"></input>
			</div>
			<div class="row">
			<label class="col-md-3">Creator</label><input class="col-md-9" type ="text" ng-model="creator"></input>
			</div>
			<div class="row">
			<label class="col-md-3">Content</label><input type ="text"class="col-md-9" ng-model="content"></input>
			</div>
			<div>
			<button type="button" class="btn btn-default"style="float:right"ng-click="write()">Submit</button>
			</div>
			
		</div>
		<div class="board-box">
			<h3>게시판</h3>
			<div class="list-group">
				<a ng-repeat = "board in boards.boardList" class="list-group-item">{{board.title}}
					<span style="display:inline-block;float:right">{{board.creator}}</span>
				</a>
	        </div>
		</div>
		<button type="button" class="btn btn-default"style="float:right"ng-click="clearRedis()">Clear Redis</button>
	</div>
	
</div>