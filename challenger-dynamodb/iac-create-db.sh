aws dynamodb create-table 
    --table-name Music 
    --attribute-definitions 
           AttributeName=Artist_Id,AttributeType=S
           AttributeName=NameArtist,AttributeType=S
           AttributeName=AlbumTitle,AttributeType=S
           AttributeName=SongTitle,AttributeType=S
           AttributeName=SongYear,AttributeType=S
    --key-schema 
           AttributeName=Artist_Id,KeyType=HASH 
           AttributeName=SongTitle,KeyType=RANGE 
    --billing-mode PAY_PER_REQUEST;